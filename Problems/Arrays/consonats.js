var string = "Pravesh"

function CandV(string){
let consonats = 0
let vowel=0
    
    string.split("").map((ch)=> {
        if(ch.toUpperCase() ===  "A"|| ch.toUpperCase() === "E"||ch.toUpperCase() === "I"||ch.toUpperCase() === "O"||ch.toUpperCase() === "U"){
            vowel++
        }else{
            consonats++
        }
        
        
    })

    return {vowel: vowel, consonats: consonats}
}

console.log(CandV(string))