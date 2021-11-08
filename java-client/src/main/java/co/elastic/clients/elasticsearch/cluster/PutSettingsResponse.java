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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.put_settings.Response
@JsonpDeserializable
public class PutSettingsResponse implements JsonpSerializable {
	private final boolean acknowledged;

	private final Map<String, JsonData> persistent;

	private final Map<String, JsonData> transient_;

	// ---------------------------------------------------------------------------------------------

	private PutSettingsResponse(Builder builder) {

		this.acknowledged = ModelTypeHelper.requireNonNull(builder.acknowledged, this, "acknowledged");
		this.persistent = ModelTypeHelper.unmodifiableRequired(builder.persistent, this, "persistent");
		this.transient_ = ModelTypeHelper.unmodifiableRequired(builder.transient_, this, "transient_");

	}

	public static PutSettingsResponse of(Function<Builder, ObjectBuilder<PutSettingsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code acknowledged}
	 */
	public final boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * Required - API name: {@code persistent}
	 */
	public final Map<String, JsonData> persistent() {
		return this.persistent;
	}

	/**
	 * Required - API name: {@code transient}
	 */
	public final Map<String, JsonData> transient_() {
		return this.transient_;
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

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		if (ModelTypeHelper.isDefined(this.persistent)) {
			generator.writeKey("persistent");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.persistent.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.transient_)) {
			generator.writeKey("transient");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.transient_.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutSettingsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutSettingsResponse> {
		private Boolean acknowledged;

		private Map<String, JsonData> persistent;

		private Map<String, JsonData> transient_;

		/**
		 * Required - API name: {@code acknowledged}
		 */
		public final Builder acknowledged(boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * Required - API name: {@code persistent}
		 */
		public final Builder persistent(Map<String, JsonData> value) {
			this.persistent = value;
			return this;
		}

		/**
		 * Required - API name: {@code transient}
		 */
		public final Builder transient_(Map<String, JsonData> value) {
			this.transient_ = value;
			return this;
		}

		/**
		 * Builds a {@link PutSettingsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutSettingsResponse build() {
			_checkSingleUse();

			return new PutSettingsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutSettingsResponse}
	 */
	public static final JsonpDeserializer<PutSettingsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutSettingsResponse::setupPutSettingsResponseDeserializer, Builder::build);

	protected static void setupPutSettingsResponseDeserializer(DelegatingDeserializer<PutSettingsResponse.Builder> op) {

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::persistent, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "persistent");
		op.add(Builder::transient_, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "transient");

	}

}
