let array = [1,2,3, [4,5,[6,7],[[[[NaN], undefined]]]]]


function flatten(items) {
    const flat = [];
  
    // items.forEach(item => {
    //   if (Array.isArray(item)) {
    //     flat.push(...flatten(item));
    //   } else {
    //     flat.push(item);
    //   }
    // });
    items.map((item)=>{
        if(Array.isArray(item)){
            flat.push(...flatten(item))
        }else{
            flat.push(item)
        }
    })
  
    return flat;
  }

  console.log(flatten(array))