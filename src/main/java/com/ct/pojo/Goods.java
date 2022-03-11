package com.ct.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_goods")
public class Goods {
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;
    private String name;
    private String thumbnail;
    private String content;
    private String price;
    private String cdate;
    private String categoryId;
    private String dangerNum;
    private String number;
    private String place;
    private String providerId;
}