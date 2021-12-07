let arr =  [10,4,5,2,5,6,9]

function  median(arrr) {
   
    return arrr[Math.ceil(arrr.length/2+0.5)]
}

// console.log(median(arr))

function  mostRepeated(ar) {



    const occurance = ar.reduce(function (acc, curr) {
        return acc[curr] ? ++acc[curr] : acc[curr] = 1, acc
      }, {})
      
      
      let MostFrequent = 0
      let frequency = 0
      Object.keys(occurance).map((occ)=>{
         if(occurance[occ]>frequency){
            frequency = occurance[occ]
            MostFrequent = occ
         }
      })
    // console.log(MostFrequent)
      return MostFrequent
    
}

console.log(mostRepeated(arr))