package com.sailthru.client.params;

import com.google.gson.reflect.TypeToken;
import com.sailthru.client.ApiAction;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Prajwal Tuladhar <praj@sailthru.com>
 */
public class Purchase extends AbstractApiParams implements ApiParams {
    protected String email;
    protected java.util.List<PurchaseItem> items;
    protected java.util.List<Map<String, Object>> discounts;
    protected java.util.List<Map<String, Object>> tenders;
    protected Integer incomplete;
    protected String message_id;
    protected String reminder_template;
    protected String reminder_time;
    protected String send_template;
    protected Map<String, Object> vars;

    public Purchase setEmail(String email) {
        this.email = email;
        return this;
    }

    public Purchase setItems(java.util.List<PurchaseItem> items) {
        this.items = items;
        return this;
    }

    public Purchase setDiscounts(java.util.List<Discount> discounts) {
        this.discounts = new ArrayList<Map<String, Object>>();
        for (Discount discount : discounts) {
            this.discounts.add(discount.toHashMap());
        }
        return this;
    }

    public Purchase setTenders(java.util.List<Tender> tenders) {
        this.tenders = new ArrayList<Map<String, Object>>();
        for (Tender tender : tenders) {
            this.tenders.add(tender.toHashMap());
        }
        return this;
    }

    public Purchase setAsIncomplete() {
        this.incomplete = 1;
        return this;
    }

    public Purchase setMessageId(String messageId) {
        this.message_id = messageId;
        return this;
    }

    public Purchase setReminderTemplate(String reminderTemplate) {
        this.reminder_template =  reminderTemplate;
        return this;
    }

    public Purchase setReminderTime(Date reminderTime) {
        this.reminder_time = reminderTime.toString();
        return this;
    }

    public Purchase setReminderTime(String reminderTime) {
        this.reminder_time = reminderTime;
        return this;
    }

    public Purchase setSendTemplate(String sendTemplate) {
        this.send_template = sendTemplate;
        return this;
    }

    public Purchase setVars(Map<String, Object> vars) {
        this.vars = vars;
        return this;
    }

    public Type getType() {
        Type type = new TypeToken<Purchase>() {}.getType();
        return type;
    }

    @Override
    public ApiAction getApiCall() {
        return ApiAction.purchase;
    }
}
