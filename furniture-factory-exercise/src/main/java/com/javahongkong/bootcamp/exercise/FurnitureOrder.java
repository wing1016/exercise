package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;
import java.util.stream.Collectors;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor ok
        ordersOfFurnitures = new HashMap<Furniture, Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method ok
        Integer count = 0;
        if(ordersOfFurnitures.containsKey(type)) {
            count = ordersOfFurnitures.get(type);
        }
        ordersOfFurnitures.put(type, count + furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method ok
        return new HashMap<Furniture, Integer>(ordersOfFurnitures);
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method ok
         if(!ordersOfFurnitures.isEmpty()) {
        	return ordersOfFurnitures.entrySet().stream()
        			.map(f -> f.getKey().cost() * f.getValue())
        			.collect(Collectors.toList())
        			.stream()
        			.reduce(Float::sum)
        			.get();
        }
        return 0.0f;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        if(ordersOfFurnitures.containsKey(type)) {
        	return ordersOfFurnitures.get(type);
        }
        return 0; 
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if(ordersOfFurnitures.containsKey(type)) {
        	return ordersOfFurnitures.get(type) * type.cost();
        }
        return 0.0f;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        if(!ordersOfFurnitures.isEmpty()) {
        	return ordersOfFurnitures.values().stream()
        			.reduce(Integer::sum)
        			.get();
        }
        return 0;
    }
}