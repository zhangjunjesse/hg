<#macro cssResources>
<!-- Bootstrap Docs -->
<link href="http://getbootstrap.com/docs-assets/css/docs.css" rel="stylesheet" media="screen">

<!-- Bootstrap -->
<link rel="stylesheet" media="screen" href="/css/bootstrap.min.css">
<link rel="stylesheet" media="screen" href="/css/bootstrap-theme.min.css">

<!-- Bootstrap Admin Theme -->
<link rel="stylesheet" media="screen" href="/css/bootstrap-admin-theme.css">
<link rel="stylesheet" media="screen" href="/css/bootstrap-admin-theme-change-size.css">

<!--My Css -->
<link rel="stylesheet" media="screen" href="/css/mycss_back.css">

<#import "/spring.ftl" as spring/>  

${head}
</#macro>
<#macro jsResources>
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<![endif]-->
<script type="text/javascript" src="/js/html5shiv.js"></script>
<script type="text/javascript" src="/js/respond.min.js"></script>

<script type="text/javascript" src="/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/twitter-bootstrap-hover-dropdown.min.js"></script>
<script type="text/javascript" src="/js/bootstrap-admin-theme-change-size.js"></script>
</#macro>