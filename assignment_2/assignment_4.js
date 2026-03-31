// 4: Product Filter & Transform
// Filter products with price > 1000
// Use map() to:
// • Add discountedPrice (10% off)
// Return new array



const products = {
    product1: {
        name: "Shirt",
        price: 500,
        quantity: 2
    },
    product2: {
        name: "Jeans",
        price: 1000,
        quantity: 1
    },
    product3: {
        name: "Shoes",
        price: 1500,
        quantity: 1
    },
        product4: {
        name: "Perfumes",
        price: 1900,
        quantity: 1
    }
}

const result = Object.entries(products).filter(([key,value])=>value.price>1000).map(
    ([key,value])=>({...value,discountedPrice:value.price*0.1}))


console.log(result)