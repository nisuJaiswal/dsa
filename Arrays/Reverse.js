const arr = [12,14,54,77,43,1]

const reverseArrStatic = (arr) => {
    return arr.reverse()
}
const reverseUsingSwap = (arr,start,end) => {
    // console.log(arr)
    while(start < end) {
        let temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }
    return arr
}
console.log(reverseArrStatic(arr))
console.log(reverseUsingSwap(arr,0,arr.length -1 ))