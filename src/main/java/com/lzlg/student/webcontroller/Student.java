package com.lzlg.student.webcontroller;

import com.lzlg.student.util.Message;
import com.lzlg.student.util.MessageUtil;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
    public Message<String> add(Student student){
        return MessageUtil.success("添加成功");
    }
}
