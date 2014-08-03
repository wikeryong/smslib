
package org.smslib.smsserver.db;

import java.util.Collection;
import org.smslib.smsserver.db.data.DeliveryReportDefinition;
import org.smslib.smsserver.db.data.GatewayDefinition;
import org.smslib.smsserver.db.data.GroupDefinition;
import org.smslib.smsserver.db.data.InboundCallDefinition;
import org.smslib.smsserver.db.data.NumberRouteDefinition;

public interface IDatabaseHandler
{
	public Collection<GatewayDefinition> getGatewayDefinitions(String profile) throws Exception;
	public Collection<NumberRouteDefinition> getNumberRouteDefinitions(String profile) throws Exception;
	public Collection<GroupDefinition> getGroupDefinitions(String profile) throws Exception;
	public void SetMessage(String messageId, String status) throws Exception;
	public void SaveInboundCall(InboundCallDefinition inboundCall) throws Exception;
	public void SaveDeliveryReport(DeliveryReportDefinition deliveryReport) throws Exception;
}
