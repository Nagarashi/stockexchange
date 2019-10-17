package com.switchfully.stockexchange;

import exchange.StockDto;
import exchange.StockExchangeController;
import exchange.StockMapper;
import service.StockService;

public class myCLI {
    public static void main(String[] args) {
        if (args.length == 1) {
            StockExchangeController stockExchangeController = new StockExchangeController(new StockService(), new StockMapper());
            StockDto stockDto = stockExchangeController.getStock(args[0]);
            printStockDto(stockDto);
        } else {
            System.out.println("Stock not found");
        }
    }

    private static void printStockDto(StockDto stockDto) {
        System.out.println(String.format("Stock information for stockId: %s", stockDto.getId()));
        System.out.println(String.format("\tName: %s", stockDto.getName()));
        System.out.println(String.format("\tPrice: %s %s", stockDto.getPrice().intValue(), stockDto.getCurrency()));
    }
}
