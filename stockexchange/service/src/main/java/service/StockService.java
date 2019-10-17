package service;

import com.switchfully.stockexchange.stockexchange.*;

import java.math.BigDecimal;

public class StockService {

    public Stock getStock(String stockId) {
        try {
            Stock stockWithoutPrice = StockRepository.getStockInformation(stockId);
            return getEnrichedStock(stockWithoutPrice);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return new Stock(stockId, "unknown");
        }
    }


    private Stock getEnrichedStock(Stock stockWithoutPrice) {
        BigDecimal priceInEuroForStock = ExternalStockInformationService
                .getPriceInEuroForStock(stockWithoutPrice.getId());
        stockWithoutPrice.setPrice(new StockPrice(priceInEuroForStock, StockCurrency.EUR));
        return stockWithoutPrice;
    }
}
