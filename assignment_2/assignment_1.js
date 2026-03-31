// 1: Student Report System
// Calculate average marks for each student
// Add a new property average using map()
// Assign result:
// • Avg ≥ 75 → "Distinction"
// • Avg ≥ 50 → "Pass"
// • Else → "Fail"


const students = {
  dhrumil: [45, 89, 67, 78],
  meet: [89, 56, 78, 90],
  mihir: [98, 74, 63, 84]
};


const result = Object.entries(students).map(([name,marks])=>{
    const total = marks.reduce((num, res)=> num+res,0)
    const avg = total/marks.length
    let grade
    if(avg >= 75){
        grade = "Distinction"
    }else if(avg >= 50){
        grade = "Pass"
    }else{
        grade = "Fail"
    }
    return {
        name,
        marks,
        total,
        avg,
        grade
    }

})

console.log(result)