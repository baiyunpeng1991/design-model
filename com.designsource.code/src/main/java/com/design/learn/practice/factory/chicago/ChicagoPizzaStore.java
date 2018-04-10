package com.design.learn.practice.factory.chicago;


import com.design.learn.practice.factory.CondimentFactory;
import com.design.learn.practice.factory.Pizza;
import com.design.learn.practice.factory.PizzaStore;

import static com.design.learn.practice.factory.chicago.ChicagoPizzaStore.ChicagoPizzaEnum.CHEESE;
import static com.design.learn.practice.factory.chicago.ChicagoPizzaStore.ChicagoPizzaEnum.PEPPERONI;
import static com.design.learn.practice.factory.chicago.ChicagoPizzaStore.ChicagoPizzaEnum.VEGGIE;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore() {
    }

    @Override
    protected Pizza createPizza(String pizzaType) {
        CondimentFactory condimentFactory = new ChicagoCondimentFactoty();
        if(CHEESE.getPizzaName().equals(pizzaType)){
            return new CheesePizza(condimentFactory);
        }else if(VEGGIE.getPizzaName().equals(pizzaType)){
            return new ViggiePizza(condimentFactory);
        }else if (PEPPERONI.getPizzaName().equals(pizzaType)){
            return new PepperoniPizza(condimentFactory);
        }
        return null;
    }

    protected enum ChicagoPizzaEnum{

        CHEESE("cheese"),

        VEGGIE("viggie"),

        PEPPERONI("pepperoni");

        private String pizzaName;

        ChicagoPizzaEnum(String pizzaName) {
            this.pizzaName = pizzaName;
        }

        public String getPizzaName() {
            return pizzaName;
        }
    }
}
