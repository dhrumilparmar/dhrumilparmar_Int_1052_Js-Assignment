let employee = [
    {
        name: "Dhrumil",
        age: 18,
        salary: 10000,
        city: "Vadodara"
    },
    {
        name: "Virat",
        age: 19,
        salary: 200000,
        city: "Bengluru"
    },
    {
        name: "Dhoni",
        age: 20,
        salary: 300000,
        city: "Chennai"
    }
]

let updatedEmployee;
function employeeSalary(employee){   

    // filter
    let salary_more_40k = employee.filter(emp => emp.salary > 40000);

    // update salary
    let updatedSalary = salary_more_40k.map(emp => {
        return {
            ...emp,
            salary: emp.salary + emp.salary * 0.1,
            level: emp.salary > 70000 ? "Senior" : "Mid"
        }
    })

    // console.log("Filtered:", salary_more_40k)
    // console.log("Updated:", updatedSalary)

    return updatedSalary;
}

updatedEmployee = employeeSalary(employee)
console.log("updated Employee", updatedEmployee);
console.log("original ", employee)