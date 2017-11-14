package service.Controller;


import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import service.Model.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class CarController {

    private final AtomicLong counter = new AtomicLong();
    private final List<Car> cars = new ArrayList<>();


    /**
     * Metodo para retornar todos os carros
     */
    @RequestMapping(value = "/car", method = GET)
    public List<Car> car(){
        return cars;
    }

    /**
     * @param marca (obrigatorio)
     * @param cor (não obrigatorio)
     * @return retonar todos os carros por marca e cor
     */
    @RequestMapping(value="/car/{marca}",method = GET)
    public List<Car> car(@PathVariable("marca") String marca,@RequestParam(value="cor", required = false) String cor){

        List<Car> returnCars = new ArrayList<>();

        for(Car car:cars)
        {
            /**
             * Testa se a cor e a marca é igual as passadas na URL
             * se for salva na lista de carros a serem retornados
             */
            if(car.getMarca().equals(marca)){
                returnCars.add(car);
            }
        }

        return returnCars;
    }

    @RequestMapping(value="/addCar", method = POST)
    public String addCar(@RequestBody Car car, BindingResult result){

        if (result.hasErrors()) {
            return "error";
        }

        /**
         * adiciona um id para o carro que estamos passando
         */

        car.setId((int) counter.incrementAndGet());
        cars.add(car);

        return "OK";
    }


}
