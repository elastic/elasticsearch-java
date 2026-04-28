/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: inference._types.Message

/**
 * An object representing part of the conversation.
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.Message">API
 *      specification</a>
 */
@JsonpDeserializable
public class Message implements JsonpSerializable {
	@Nullable
	private final MessageContent content;

	private final String role;

	@Nullable
	private final String toolCallId;

	private final List<ToolCall> toolCalls;

	@Nullable
	private final String reasoning;

	private final List<ReasoningDetail> reasoningDetails;

	// ---------------------------------------------------------------------------------------------

	private Message(Builder builder) {

		this.content = builder.content;
		this.role = ApiTypeHelper.requireNonNull(builder.role, this, "role");
		this.toolCallId = builder.toolCallId;
		this.toolCalls = ApiTypeHelper.unmodifiable(builder.toolCalls);
		this.reasoning = builder.reasoning;
		this.reasoningDetails = ApiTypeHelper.unmodifiable(builder.reasoningDetails);

	}

	public static Message of(Function<Builder, ObjectBuilder<Message>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The content of the message.
	 * <p>
	 * String example:
	 * 
	 * <pre>
	 * <code>{
	 *    &quot;content&quot;: &quot;Some string&quot;
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Text example:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;content&quot;: [
	 *       {
	 *        &quot;text&quot;: &quot;Some text&quot;,
	 *        &quot;type&quot;: &quot;text&quot;
	 *       }
	 *    ]
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Image example:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;content&quot;: [
	 *       {
	 *        &quot;image_url&quot;: {
	 *          &quot;url&quot;: &quot;data:image/jpeg;base64,...&quot;
	 *        },
	 *        &quot;type&quot;: &quot;image_url&quot;
	 *       }
	 *    ]
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * File example:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;content&quot;: [
	 *       {
	 *        &quot;file&quot;: {
	 *          &quot;file_data&quot;: &quot;data:application/pdf;base64,...&quot;,
	 *          &quot;filename&quot;: &quot;somePDF&quot;
	 *        },
	 *        &quot;type&quot;: &quot;file&quot;
	 *       }
	 *    ]
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * API name: {@code content}
	 */
	@Nullable
	public final MessageContent content() {
		return this.content;
	}

	/**
	 * Required - The role of the message author. Valid values are
	 * <code>user</code>, <code>assistant</code>, <code>system</code>, and
	 * <code>tool</code>.
	 * <p>
	 * API name: {@code role}
	 */
	public final String role() {
		return this.role;
	}

	/**
	 * Only for <code>tool</code> role messages. The tool call that this message is
	 * responding to.
	 * <p>
	 * API name: {@code tool_call_id}
	 */
	@Nullable
	public final String toolCallId() {
		return this.toolCallId;
	}

	/**
	 * Only for <code>assistant</code> role messages. The tool calls generated by
	 * the model. If it's specified, the <code>content</code> field is optional.
	 * Example:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;tool_calls&quot;: [
	 *       {
	 *           &quot;id&quot;: &quot;call_KcAjWtAww20AihPHphUh46Gd&quot;,
	 *           &quot;type&quot;: &quot;function&quot;,
	 *           &quot;function&quot;: {
	 *               &quot;name&quot;: &quot;get_current_weather&quot;,
	 *               &quot;arguments&quot;: &quot;{\&quot;location\&quot;:\&quot;Boston, MA\&quot;}&quot;
	 *           }
	 *       }
	 *   ]
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * API name: {@code tool_calls}
	 */
	public final List<ToolCall> toolCalls() {
		return this.toolCalls;
	}

	/**
	 * Only for <code>assistant</code> role messages. The reasoning details
	 * generated by the model as plaintext. Currently supported only for
	 * <code>elastic</code> provider.
	 * <p>
	 * API name: {@code reasoning}
	 */
	@Nullable
	public final String reasoning() {
		return this.reasoning;
	}

	/**
	 * Only for <code>assistant</code> role messages. The reasoning details
	 * generated by the model as structured data. Currently supported only for
	 * <code>elastic</code> provider.
	 * <p>
	 * API name: {@code reasoning_details}
	 */
	public final List<ReasoningDetail> reasoningDetails() {
		return this.reasoningDetails;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.content != null) {
			generator.writeKey("content");
			this.content.serialize(generator, mapper);

		}
		generator.writeKey("role");
		generator.write(this.role);

		if (this.toolCallId != null) {
			generator.writeKey("tool_call_id");
			generator.write(this.toolCallId);

		}
		if (ApiTypeHelper.isDefined(this.toolCalls)) {
			generator.writeKey("tool_calls");
			generator.writeStartArray();
			for (ToolCall item0 : this.toolCalls) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.reasoning != null) {
			generator.writeKey("reasoning");
			generator.write(this.reasoning);

		}
		if (ApiTypeHelper.isDefined(this.reasoningDetails)) {
			generator.writeKey("reasoning_details");
			generator.writeStartArray();
			for (ReasoningDetail item0 : this.reasoningDetails) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Message}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Message> {
		@Nullable
		private MessageContent content;

		private String role;

		@Nullable
		private String toolCallId;

		@Nullable
		private List<ToolCall> toolCalls;

		@Nullable
		private String reasoning;

		@Nullable
		private List<ReasoningDetail> reasoningDetails;

		public Builder() {
		}
		private Builder(Message instance) {
			this.content = instance.content;
			this.role = instance.role;
			this.toolCallId = instance.toolCallId;
			this.toolCalls = instance.toolCalls;
			this.reasoning = instance.reasoning;
			this.reasoningDetails = instance.reasoningDetails;

		}
		/**
		 * The content of the message.
		 * <p>
		 * String example:
		 * 
		 * <pre>
		 * <code>{
		 *    &quot;content&quot;: &quot;Some string&quot;
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * Text example:
		 * 
		 * <pre>
		 * <code>{
		 *   &quot;content&quot;: [
		 *       {
		 *        &quot;text&quot;: &quot;Some text&quot;,
		 *        &quot;type&quot;: &quot;text&quot;
		 *       }
		 *    ]
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * Image example:
		 * 
		 * <pre>
		 * <code>{
		 *   &quot;content&quot;: [
		 *       {
		 *        &quot;image_url&quot;: {
		 *          &quot;url&quot;: &quot;data:image/jpeg;base64,...&quot;
		 *        },
		 *        &quot;type&quot;: &quot;image_url&quot;
		 *       }
		 *    ]
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * File example:
		 * 
		 * <pre>
		 * <code>{
		 *   &quot;content&quot;: [
		 *       {
		 *        &quot;file&quot;: {
		 *          &quot;file_data&quot;: &quot;data:application/pdf;base64,...&quot;,
		 *          &quot;filename&quot;: &quot;somePDF&quot;
		 *        },
		 *        &quot;type&quot;: &quot;file&quot;
		 *       }
		 *    ]
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code content}
		 */
		public final Builder content(@Nullable MessageContent value) {
			this.content = value;
			return this;
		}

		/**
		 * The content of the message.
		 * <p>
		 * String example:
		 * 
		 * <pre>
		 * <code>{
		 *    &quot;content&quot;: &quot;Some string&quot;
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * Text example:
		 * 
		 * <pre>
		 * <code>{
		 *   &quot;content&quot;: [
		 *       {
		 *        &quot;text&quot;: &quot;Some text&quot;,
		 *        &quot;type&quot;: &quot;text&quot;
		 *       }
		 *    ]
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * Image example:
		 * 
		 * <pre>
		 * <code>{
		 *   &quot;content&quot;: [
		 *       {
		 *        &quot;image_url&quot;: {
		 *          &quot;url&quot;: &quot;data:image/jpeg;base64,...&quot;
		 *        },
		 *        &quot;type&quot;: &quot;image_url&quot;
		 *       }
		 *    ]
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * File example:
		 * 
		 * <pre>
		 * <code>{
		 *   &quot;content&quot;: [
		 *       {
		 *        &quot;file&quot;: {
		 *          &quot;file_data&quot;: &quot;data:application/pdf;base64,...&quot;,
		 *          &quot;filename&quot;: &quot;somePDF&quot;
		 *        },
		 *        &quot;type&quot;: &quot;file&quot;
		 *       }
		 *    ]
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code content}
		 */
		public final Builder content(Function<MessageContent.Builder, ObjectBuilder<MessageContent>> fn) {
			return this.content(fn.apply(new MessageContent.Builder()).build());
		}

		/**
		 * Required - The role of the message author. Valid values are
		 * <code>user</code>, <code>assistant</code>, <code>system</code>, and
		 * <code>tool</code>.
		 * <p>
		 * API name: {@code role}
		 */
		public final Builder role(String value) {
			this.role = value;
			return this;
		}

		/**
		 * Only for <code>tool</code> role messages. The tool call that this message is
		 * responding to.
		 * <p>
		 * API name: {@code tool_call_id}
		 */
		public final Builder toolCallId(@Nullable String value) {
			this.toolCallId = value;
			return this;
		}

		/**
		 * Only for <code>assistant</code> role messages. The tool calls generated by
		 * the model. If it's specified, the <code>content</code> field is optional.
		 * Example:
		 * 
		 * <pre>
		 * <code>{
		 *   &quot;tool_calls&quot;: [
		 *       {
		 *           &quot;id&quot;: &quot;call_KcAjWtAww20AihPHphUh46Gd&quot;,
		 *           &quot;type&quot;: &quot;function&quot;,
		 *           &quot;function&quot;: {
		 *               &quot;name&quot;: &quot;get_current_weather&quot;,
		 *               &quot;arguments&quot;: &quot;{\&quot;location\&quot;:\&quot;Boston, MA\&quot;}&quot;
		 *           }
		 *       }
		 *   ]
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code tool_calls}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>toolCalls</code>.
		 */
		public final Builder toolCalls(List<ToolCall> list) {
			this.toolCalls = _listAddAll(this.toolCalls, list);
			return this;
		}

		/**
		 * Only for <code>assistant</code> role messages. The tool calls generated by
		 * the model. If it's specified, the <code>content</code> field is optional.
		 * Example:
		 * 
		 * <pre>
		 * <code>{
		 *   &quot;tool_calls&quot;: [
		 *       {
		 *           &quot;id&quot;: &quot;call_KcAjWtAww20AihPHphUh46Gd&quot;,
		 *           &quot;type&quot;: &quot;function&quot;,
		 *           &quot;function&quot;: {
		 *               &quot;name&quot;: &quot;get_current_weather&quot;,
		 *               &quot;arguments&quot;: &quot;{\&quot;location\&quot;:\&quot;Boston, MA\&quot;}&quot;
		 *           }
		 *       }
		 *   ]
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code tool_calls}
		 * <p>
		 * Adds one or more values to <code>toolCalls</code>.
		 */
		public final Builder toolCalls(ToolCall value, ToolCall... values) {
			this.toolCalls = _listAdd(this.toolCalls, value, values);
			return this;
		}

		/**
		 * Only for <code>assistant</code> role messages. The tool calls generated by
		 * the model. If it's specified, the <code>content</code> field is optional.
		 * Example:
		 * 
		 * <pre>
		 * <code>{
		 *   &quot;tool_calls&quot;: [
		 *       {
		 *           &quot;id&quot;: &quot;call_KcAjWtAww20AihPHphUh46Gd&quot;,
		 *           &quot;type&quot;: &quot;function&quot;,
		 *           &quot;function&quot;: {
		 *               &quot;name&quot;: &quot;get_current_weather&quot;,
		 *               &quot;arguments&quot;: &quot;{\&quot;location\&quot;:\&quot;Boston, MA\&quot;}&quot;
		 *           }
		 *       }
		 *   ]
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code tool_calls}
		 * <p>
		 * Adds a value to <code>toolCalls</code> using a builder lambda.
		 */
		public final Builder toolCalls(Function<ToolCall.Builder, ObjectBuilder<ToolCall>> fn) {
			return toolCalls(fn.apply(new ToolCall.Builder()).build());
		}

		/**
		 * Only for <code>assistant</code> role messages. The reasoning details
		 * generated by the model as plaintext. Currently supported only for
		 * <code>elastic</code> provider.
		 * <p>
		 * API name: {@code reasoning}
		 */
		public final Builder reasoning(@Nullable String value) {
			this.reasoning = value;
			return this;
		}

		/**
		 * Only for <code>assistant</code> role messages. The reasoning details
		 * generated by the model as structured data. Currently supported only for
		 * <code>elastic</code> provider.
		 * <p>
		 * API name: {@code reasoning_details}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>reasoningDetails</code>.
		 */
		public final Builder reasoningDetails(List<ReasoningDetail> list) {
			this.reasoningDetails = _listAddAll(this.reasoningDetails, list);
			return this;
		}

		/**
		 * Only for <code>assistant</code> role messages. The reasoning details
		 * generated by the model as structured data. Currently supported only for
		 * <code>elastic</code> provider.
		 * <p>
		 * API name: {@code reasoning_details}
		 * <p>
		 * Adds one or more values to <code>reasoningDetails</code>.
		 */
		public final Builder reasoningDetails(ReasoningDetail value, ReasoningDetail... values) {
			this.reasoningDetails = _listAdd(this.reasoningDetails, value, values);
			return this;
		}

		/**
		 * Only for <code>assistant</code> role messages. The reasoning details
		 * generated by the model as structured data. Currently supported only for
		 * <code>elastic</code> provider.
		 * <p>
		 * API name: {@code reasoning_details}
		 * <p>
		 * Adds a value to <code>reasoningDetails</code> using a builder lambda.
		 */
		public final Builder reasoningDetails(Function<ReasoningDetail.Builder, ObjectBuilder<ReasoningDetail>> fn) {
			return reasoningDetails(fn.apply(new ReasoningDetail.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Message}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Message build() {
			_checkSingleUse();

			return new Message(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Message}
	 */
	public static final JsonpDeserializer<Message> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Message::setupMessageDeserializer);

	protected static void setupMessageDeserializer(ObjectDeserializer<Message.Builder> op) {

		op.add(Builder::content, MessageContent._DESERIALIZER, "content");
		op.add(Builder::role, JsonpDeserializer.stringDeserializer(), "role");
		op.add(Builder::toolCallId, JsonpDeserializer.stringDeserializer(), "tool_call_id");
		op.add(Builder::toolCalls, JsonpDeserializer.arrayDeserializer(ToolCall._DESERIALIZER), "tool_calls");
		op.add(Builder::reasoning, JsonpDeserializer.stringDeserializer(), "reasoning");
		op.add(Builder::reasoningDetails, JsonpDeserializer.arrayDeserializer(ReasoningDetail._DESERIALIZER),
				"reasoning_details");

	}

}
