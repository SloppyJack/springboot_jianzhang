package cn.jackbin.SimpleRecord.service;

import cn.jackbin.SimpleRecord.entity.WechatUserDO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: cn.jackbin.SimpleRecord.service
 * @date: 2020/11/3 21:33
 **/
public interface WechatUserService extends IService<WechatUserDO> {

    WechatUserDO getByOpenId(String openId);
}