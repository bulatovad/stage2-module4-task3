package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver  implements Observer {
    // Write your code here!
    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        Integer id = rectangle.getId();
        double sideA = rectangle.getSideA();
        double sideB = rectangle.getSideB();

        RectangleWarehouse warehouse = RectangleWarehouse.getInstance();
        RectangleValues current = warehouse.get(id);
        warehouse.remove(id, current);
        warehouse.put(id, new RectangleValues(sideA*sideB, 2*(sideA+sideB)));
    }

}
