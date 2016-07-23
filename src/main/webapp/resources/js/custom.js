var tool = {
    /**
     * 获得BaseUrl
     * @returns {string}
     */
    getBaseUrl: function () {
        var location = (window.location + '').split('/');
        var basePath = location[0] + '//' + location[2] + '/' + location[3];
        return basePath;
    },

    /**
     * 判断字符串是否不为空
     * @param text
     * @returns {boolean}
     */
    notNull: function (text) {
        text = $.trim(text);
        return (typeof(text) != "undefined" && text.length > 0) ? true : false;
    },

    /**
     * 判断一堆字符串是否不为空
     * @returns {boolean}
     */
    notNullAll: function () {
        for (var i = 0; i < arguments.length; i++) {
            var isNull = tool.isNull(arguments[i]);
            if (isNull) return false;
        }
        return true;
    },

    /**
     * 判断字符串是否为空
     * @param text
     * @returns {boolean}
     */
    isNull: function (text) {
        return !tool.notNull(text);
    }
}

var loginScript = {
    URL: {
        loginSubUrl: tool.getBaseUrl() + "login_sub",
    },
    beforeSubmit: function () {
        var username = $("#username").val();
        var password = $("#password").val();
        console.log(username);
        if (tool.notNullAll(username, password)) {
            //填写了账号和密码
            var md5password = hex_md5(password);
            loginScript.doSubmit(username, md5password);
        }
        return false;
    },
    doSubmit: function (username, md5password) {
        var submitUrl = loginScript.URL.loginSubUrl;
        $.post(submitUrl, {
            username: username,
            password: md5password
        },
        function (data) {
            if(data['success']){
                console.log("登陆成功");
            }else{
                console.log("登陆失败");
            }
            console.log(data);
            window.location.reload();
        });
    }
}