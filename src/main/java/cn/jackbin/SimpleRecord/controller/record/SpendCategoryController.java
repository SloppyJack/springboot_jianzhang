package cn.jackbin.SimpleRecord.controller.record;

import cn.jackbin.SimpleRecord.dto.CodeMsg;
import cn.jackbin.SimpleRecord.dto.Result;
import cn.jackbin.SimpleRecord.entity.SpendCategoryDO;
import cn.jackbin.SimpleRecord.service.SpendCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.controller.v1
 * @date: 2020/6/10 21:19
 **/
@Api(value = "SpendCategoryController", tags = { "花费类别访问接口" })
@RestController
@RequestMapping("/v1/spendCategory")
@Validated
public class SpendCategoryController {
    @Autowired
    private SpendCategoryService spendCategoryService;

    @ApiOperation(value = "获取所有花费类别")
    @GetMapping("")
    public Result getSpendCategoryList() {
        List<SpendCategoryDO> list = spendCategoryService.findAll();
        return Result.success(list);
    }

    @ApiOperation(value = "通过记账类型获取花费类别")
    @GetMapping("/getByRecordType")
    public Result getByRecordType(@ApiParam(required = true, value = "记账类型Id") @Validated
                              @Positive(message = "记账类型Id为整数") @RequestParam(value = "recordTypeId")  int id) {
        List<SpendCategoryDO> list = spendCategoryService.getByRecordTypeId(id);
        if (list == null) {
            return Result.error(CodeMsg.NOT_FIND_DATA);
        }
        return Result.success(list);
    }
}