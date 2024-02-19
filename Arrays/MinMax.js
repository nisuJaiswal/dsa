const arr = [12,14,54,77,43,1]

const minMaxUsingSort = (arr) => {
    const sortedArr = arr.sort((a,b) => a-b)
    console.log("Min:", sortedArr[0])
    console.log("Max:", sortedArr[sortedArr.length - 1])
}

const minMaxLinear = (arr,low,high) => {
    let min, max;
    min = max = arr[low];
    if(low === high) {
        min = max = arr[low]
        return [min,max]
    }  
    arr.forEach(el => {
        if(el < min) min = el
        if(el > max) max = el
    })
    return [min,max]
}

minMaxUsingSort(arr)
console.log(minMaxLinear(arr,0,arr.length - 1))