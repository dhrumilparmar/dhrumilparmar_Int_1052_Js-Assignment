document.getElementById("form").addEventListener("submit", function(e) {
    // e.preventDefault();

    const rows = document.querySelectorAll(".item-row");

    let cart = [];//create empty array

    rows.forEach(row => {
        const inputs = row.querySelectorAll("input");
        const item = inputs[0].value;
        const quantity = Number(inputs[1].value);
        const price = Number(inputs[2].value);

        cart.push( {item, quantity, price } );
    });

    console.log("Cart:", cart);

    // Calculate total
    const total = cart.map(items => items.price * items.quantity).reduce((num, res) => num + res, 0);

    const totalQuantity = cart.map(items => items.quantity).reduce((num, res) => num + res, 0);

    document.getElementById("bill").innerHTML = `
        <h3>Total: ₹${total}</h3>
        <h3>Toal Quantity: ${totalQuantity} </h3>
    `;
});

//add multiple products
document.getElementById("add").addEventListener("click", function() {
    
    const container = document.getElementById("items-container");

    const newRow = document.createElement("div");
    newRow.classList.add("item-row");

    newRow.innerHTML = `
        <label>Product:</label>
        <input type="text" placeholder="Enter product">

        <label>Quantity:</label>
        <input type="number" placeholder="Enter quantity">

        <label>Price:</label>
        <input type="number" placeholder="Enter price">
    `;

    container.appendChild(newRow);
});