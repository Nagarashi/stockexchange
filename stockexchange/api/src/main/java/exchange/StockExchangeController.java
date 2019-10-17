package exchange;

import com.switchfully.stockexchange.stockexchange.Stock;
import service.StockService;

public class StockExchangeController {
    private StockService stockService;
    private StockMapper stockMapper;

    public StockExchangeController(StockService stockService, StockMapper stockMapper) {
        this.stockService = stockService;
        this.stockMapper = stockMapper;
    }

    public StockDto getStock(String stockId){
        Stock bobbie = stockService.getStock(stockId);
        return stockMapper.mapToDto(bobbie);
    }
}
