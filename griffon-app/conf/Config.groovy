application {
    title = 'griffon-basico'
    startupGroups = ['griffonBasico']
    autoShutdown = true
}
mvcGroups {
    // MVC Group for "griffonBasico"
    'griffonBasico' {
        model      = 'org.example.GriffonBasicoModel'
        view       = 'org.example.GriffonBasicoView'
        controller = 'org.example.GriffonBasicoController'
    }
}