modules = {
    stripe {
        dependsOn 'jquery'
        resource id:'stripe', url:[plugin:'stripe', dir:'js', file:'stripe-v2.js'], disposition:'head', exclude:'minify'   
    }
}
