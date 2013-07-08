def quicksort(lst){
    if(lst.size() <= 1){return lst}
    def greater = []
    def middle = []
    def less = []
    def pivot = lst[lst.size().intdiv(2)]
    for(item in lst){ 
        if(item < pivot){ less.add(item)}
        else if(item == pivot){middle.add(item)}
        else{greater.add(item)}
    }
    return quicksort(less)+middle+quicksort(greater)
}