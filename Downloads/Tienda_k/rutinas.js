function readURL(input){
    if (input.files && input.files[0]){
        var reader = new FIleReader();
        reader.onload = function (e){
            $('#patito')
                    .attr('src',e.target.result)
                    .height(200);
            
        };
        reader.readAsDataURL(input.files[0]);
    }
}

