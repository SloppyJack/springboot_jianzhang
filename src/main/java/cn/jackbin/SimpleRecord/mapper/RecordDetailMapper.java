package cn.jackbin.SimpleRecord.mapper;

import cn.jackbin.SimpleRecord.entity.RecordDetailDO;
import cn.jackbin.SimpleRecord.vo.RecordDetailVo;
import cn.jackbin.SimpleRecord.vo.SpendTotalCategoryVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: cn.jackbin.SimpleRecord.mapper
 * @date: 2020/9/16 22:30
 **/
@Repository
public interface RecordDetailMapper extends BaseMapper<RecordDetailDO> {

    /**
     * 根据月份查询总额
     * @param userId 用户Id
     * @param recordTypeCode 记录类型Code
     * @param date 时间
     * @return List
     */
    Double querySpendTotalByMonth(Long userId, String recordTypeCode, Date date);

    /**
     * 获取花费类别的消费总额
     * @param userId 用户Id
     * @param recordTypeCode 记账类型Code
     * @param date 时间
     * @param begin 索引
     * @param end 索引
     * @return
     */
    List<SpendTotalCategoryVO> querySpendTotalBySpendCategory(Long userId, String recordTypeCode, Date date, int begin, int end);

    /**
     * 查询用户某个月内的记账记录
     */
    List<RecordDetailVo> queryByMonth(Long userId, String recordTypeCode, Date date, int begin, int end);
}
