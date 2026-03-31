let cart = [
    {
        item: "item1",
        price: 100,
        quantity: 2
    },
    {
        item: "item2",
        price: 200,
        quantity: 1
    },
    {
        item: "item3",
        price: 300,
        quantity: 3
    }
]
// calculate total amount
let totalAmount = cart.map(items => items.price * items.quantity).reduce((num, res) => num + res, 0)
let totalQuantity = cart.map(items => items.quantity).reduce((num, res) => num + res, 0)
console.log(totalAmount)
console.log(totalQuantity)

