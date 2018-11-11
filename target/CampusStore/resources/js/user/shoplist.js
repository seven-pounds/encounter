/**
 *
 */
$(function () {


    var registerUrl = '/user/register';

    // 提交按钮的事件响应，分别对店铺注册和编辑操作做不同响应
    $('#submit').click(function () {
        // 创建shop对象
        var user = {};


        // 获取表单里的数据并填充进对应的店铺属性中
        user.userName = $('#user-name').val();
        if (!user.userName) {
            $.toast('please enter user name！');
            return;
        }

        user.password = $('#password').val();
        if (!user.password) {
            $.toast('please enter user password！');
            return;
        }
        user.confirmPassword = $('#confirmpassword').val();
        if (!user.confirmPassword) {
            $.toast('please confirm user password！');
            return;
        }
        user.gender = {
            shopCategoryId: $('#gender').find('option').not(function () {
                return !this.selected;
            }).data('id')
        };

        // 生成表单对象，用于接收参数并传递给后台
        var formData = new FormData();

        // 将shop json对象转成字符流保存至表单对象key为shopStr的的键值对里
        formData.append('userStr', JSON.stringify(user));

        $.ajax({
            url: registerUrl,
            type: 'POST',
            data: formData,
            contentType: false,
            processData: false,
            cache: false,
            success: function (data) {
                if (data.success) {
                    $.toast("提交成功**"+data.success);
                    // 若为注册操作，成功后返回店铺列表页
                    window.location.href = "/user/test";

                } else {
                    $.toast("提交失败**！"+data.success);
                }

            }
        });
    });

})