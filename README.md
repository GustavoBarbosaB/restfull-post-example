# RestFull Service

## *Este é um serviço RestFull que é capaz de fazer POST e GET.*

## Exemplo do JSON retornado na API:
```json
[
   {
        "id": 1,
        "name": "Saveiro",
        "cor": "Preta",
        "marca": "Volkswagen",
        "placa": "AAA-111"
    },
    {
        "id": 2,
        "name": "Gol",
        "cor": "Preta",
        "marca": "Volkswagen",
        "placa": "AAA-111"
    },
    {
        "id": 3,
        "name": "Golf",
        "cor": "Preta",
        "marca": "Volkswagen",
        "placa": "AAA-111"
    }
]
```

## Exemplo de JSON usado em um POST:
> O id é atribuido pela própria API
```json
{
        "name": "Golf",
        "cor": "Preta",
        "marca": "Volkswagen",
        "placa": "AAA-111"
}

```

## URL's para GET e POST
***GET todos os carros***
> http://localhost:8080/car

***GET carro por marca***
>http://localhost:8080/car/MarcaAqui

***GET carro por marca e cor***
>http://localhost:8080/car/Volkswagen?cor=Preta

***POST carro***
>http://localhost:8080/addCar
