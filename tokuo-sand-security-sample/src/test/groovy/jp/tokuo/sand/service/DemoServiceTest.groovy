//package jp.tokuo.sand.sec.service
//
//import jp.tokuo.sand.sec.property.DemoProperty
//import spock.lang.Specification
//import spock.lang.Unroll
//
//
//class DemoServiceTest extends Specification {
//
//    @Unroll
//    def "test"() {
//        given:
//        DemoProperty demoProperty = Mock()
//        def target = new DemoService(demoProperty)
//
//        when:
//        def result = target.returnRes(returnStr)
//
//        then:
//        assert result.get("status") == expect
//
//        where:
//        returnStr   | expect
//        "test"      | "test"
//        "hoge"      | "hoge"
//    }
//}