package cn.jackbin.SimpleRecord.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * <p>
 *
 * </p>
 *
 * @author jackbin
 * @since 2020-07-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_group_permission")
public class GroupPermissionDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 分组id
     */
    private Integer groupId;

    /**
     * 权限id
     */
    private Integer permissionId;


}