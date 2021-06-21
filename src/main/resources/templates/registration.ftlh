<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>

<@c.page>
    <div class="mb-1">Add a new user and receive an activation code to your email !!!</div>
    ${message?ifExists}
    <@l.login "/registration" true/>
</@c.page>