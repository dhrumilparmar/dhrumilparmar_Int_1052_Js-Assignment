// 3: User Profile Updater
// Create a function to:
// • Update city
// • Add new property profession
// Use spread operator
// Do NOT modify original object
const profile = {
    name: "Dhrumil",
    age: 21,
    city: "Pune"
}
function profileUpdater(profile, city, profession){
    return {
        ...profile,
        city: city,
        profession: profession
    }
}



console.log(profileUpdater(profile, "pune","cloud advocate"))