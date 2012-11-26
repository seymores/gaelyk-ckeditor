
get "/", forward: "/WEB-INF/pages/index.gtpl"
get "/datetime", forward: "/datetime.groovy"

get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"
get "/configuration.js", forward: "/WEB-INF/pages/configuration.js.gtpl"
get "/image/@id", redirect: "/image.groovy?id=@id"
post "/upload", forward: "/upload.groovy"
