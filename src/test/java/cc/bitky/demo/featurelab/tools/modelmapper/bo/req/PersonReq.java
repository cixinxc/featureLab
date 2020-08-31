package cc.bitky.demo.featurelab.tools.modelmapper.bo.req;

import cc.bitky.demo.featurelab.tools.modelmapper.bo.bo.Work;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liMingLiang
 * @date 2019-07-06
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonReq {
    private String name;
    private Integer age;
    private Work work;
}