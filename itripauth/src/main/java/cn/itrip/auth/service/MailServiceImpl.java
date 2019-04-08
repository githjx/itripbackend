package cn.itrip.auth.service;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("mailService")
public class MailServiceImpl implements MailService {
    @Resource
    private SimpleMailMessage mailMessage;  //允许用户快速设置邮件内容的各种属性

    @Resource
    private MailSender mailSender;  //用来发送邮件

    //https://mail.aliyun.com  进行个人邮箱注册。
    @Override
    public void sendActivationMail(String mailTo, String activationCode) {
        mailMessage.setTo(mailTo);
        mailMessage.setText("您的激活码是：" + activationCode);
        mailSender.send(mailMessage);
    }
}
