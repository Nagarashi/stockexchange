package com.switchfully.stockexchange.stockexchange;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.HashMap;

public class StockRepository {

    /*private static ImmutableMap<String, Stock> database = ImmutableMap.<String, Stock>builder()
            .put("AA", new Stock("AA", "Ambro AN"))
            .put("BB", new Stock("BB", "KBC"))
            .put("CC", new Stock("CC", "Fortis"))
            .build();*/

    private static HashMap<String, Stock> database =
            Maps.newHashMap(
                    new ImmutableMap.Builder<String, Stock>()
                            .put("AA", new Stock("AA", "Ambro AN"))
                            .put("BB", new Stock("BB", "Brumbo"))
                            .put("XND", new Stock("XND", "Xendo"))
                            .put("GL", new Stock("GL", "Golden Inc."))
                            .build()
            );

    public static Stock getStockInformation(String stockId) {
        /*if (database.get(stockId) == null) {
            throw new IllegalArgumentException("Stock not found :(");
        } else {
            return database.get(stockId);
        }
    }*/

        if(database.containsKey(stockId)) {
            return database.get(stockId);
        } else {
            throw new IllegalArgumentException(String.format("No stock found for id:%s", stockId));
        }
    }
}
