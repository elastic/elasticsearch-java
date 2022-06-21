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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.EmailAttachmentContainer

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.EmailAttachmentContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class EmailAttachment implements TaggedUnion<EmailAttachment.Kind, Object>, JsonpSerializable {

	/**
	 * {@link EmailAttachment} variant kinds.
	 */
	/**
	 * {@link EmailAttachment} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#watcher._types.EmailAttachmentContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Http("http"),

		Reporting("reporting"),

		Data("data"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public EmailAttachment(EmailAttachmentVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._emailAttachmentKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private EmailAttachment(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static EmailAttachment of(Function<Builder, ObjectBuilder<EmailAttachment>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code http}?
	 */
	public boolean isHttp() {
		return _kind == Kind.Http;
	}

	/**
	 * Get the {@code http} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code http} kind.
	 */
	public HttpEmailAttachment http() {
		return TaggedUnionUtils.get(this, Kind.Http);
	}

	/**
	 * Is this variant instance of kind {@code reporting}?
	 */
	public boolean isReporting() {
		return _kind == Kind.Reporting;
	}

	/**
	 * Get the {@code reporting} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reporting} kind.
	 */
	public ReportingEmailAttachment reporting() {
		return TaggedUnionUtils.get(this, Kind.Reporting);
	}

	/**
	 * Is this variant instance of kind {@code data}?
	 */
	public boolean isData() {
		return _kind == Kind.Data;
	}

	/**
	 * Get the {@code data} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code data} kind.
	 */
	public DataEmailAttachment data() {
		return TaggedUnionUtils.get(this, Kind.Data);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EmailAttachment> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<EmailAttachment> http(HttpEmailAttachment v) {
			this._kind = Kind.Http;
			this._value = v;
			return this;
		}

		public ObjectBuilder<EmailAttachment> http(
				Function<HttpEmailAttachment.Builder, ObjectBuilder<HttpEmailAttachment>> fn) {
			return this.http(fn.apply(new HttpEmailAttachment.Builder()).build());
		}

		public ObjectBuilder<EmailAttachment> reporting(ReportingEmailAttachment v) {
			this._kind = Kind.Reporting;
			this._value = v;
			return this;
		}

		public ObjectBuilder<EmailAttachment> reporting(
				Function<ReportingEmailAttachment.Builder, ObjectBuilder<ReportingEmailAttachment>> fn) {
			return this.reporting(fn.apply(new ReportingEmailAttachment.Builder()).build());
		}

		public ObjectBuilder<EmailAttachment> data(DataEmailAttachment v) {
			this._kind = Kind.Data;
			this._value = v;
			return this;
		}

		public ObjectBuilder<EmailAttachment> data(
				Function<DataEmailAttachment.Builder, ObjectBuilder<DataEmailAttachment>> fn) {
			return this.data(fn.apply(new DataEmailAttachment.Builder()).build());
		}

		public EmailAttachment build() {
			_checkSingleUse();
			return new EmailAttachment(this);
		}

	}

	protected static void setupEmailAttachmentDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::http, HttpEmailAttachment._DESERIALIZER, "http");
		op.add(Builder::reporting, ReportingEmailAttachment._DESERIALIZER, "reporting");
		op.add(Builder::data, DataEmailAttachment._DESERIALIZER, "data");

	}

	public static final JsonpDeserializer<EmailAttachment> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EmailAttachment::setupEmailAttachmentDeserializer, Builder::build);
}
