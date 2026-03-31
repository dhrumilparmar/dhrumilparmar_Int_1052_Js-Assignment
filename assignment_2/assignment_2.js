
// 2: Shopping Cart Analyzer
// Calculate total bill
// Return:
// • Total amount
// • Total quantity of items
// Use rest operator to accept multiple items






function cartAnalyzer(...items) {
  let totalAmount = 0;
  let totalQuantity = 0;

  items.forEach(item => {
    totalAmount += item.price * item.quantity;
    totalQuantity += item.quantity;
  });

  return {
    totalAmount,
    totalQuantity
  };
}


const result = cartAnalyzer(
  { name: "Shirt", price: 500, quantity: 2 },
  { name: "Jeans", price: 1000, quantity: 1 },
  { name: "Shoes", price: 1500, quantity: 1 }
);

console.log(result);
