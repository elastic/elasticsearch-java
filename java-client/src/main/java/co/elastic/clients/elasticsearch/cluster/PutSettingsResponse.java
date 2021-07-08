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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.put_settings.Response
public final class PutSettingsResponse implements ToJsonp {
	private final Boolean acknowledged;

	private final Map<String, JsonValue> persistent;

	private final Map<String, JsonValue> transient_;

	// ---------------------------------------------------------------------------------------------

	protected PutSettingsResponse(Builder builder) {

		this.acknowledged = Objects.requireNonNull(builder.acknowledged, "acknowledged");
		this.persistent = Objects.requireNonNull(builder.persistent, "persistent");
		this.transient_ = Objects.requireNonNull(builder.transient_, "transient");

	}

	/**
	 * API name: {@code acknowledged}
	 */
	public Boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * API name: {@code persistent}
	 */
	public Map<String, JsonValue> persistent() {
		return this.persistent;
	}

	/**
	 * API name: {@code transient}
	 */
	public Map<String, JsonValue> transient_() {
		return this.transient_;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		generator.writeKey("persistent");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.persistent.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("transient");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.transient_.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutSettingsResponse}.
	 */
	public static class Builder implements ObjectBuilder<PutSettingsResponse> {
		private Boolean acknowledged;

		private Map<String, JsonValue> persistent;

		private Map<String, JsonValue> transient_;

		/**
		 * API name: {@code acknowledged}
		 */
		public Builder acknowledged(Boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * API name: {@code persistent}
		 */
		public Builder persistent(Map<String, JsonValue> value) {
			this.persistent = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #persistent(Map)}, creating the map if needed.
		 */
		public Builder putPersistent(String key, JsonValue value) {
			if (this.persistent == null) {
				this.persistent = new HashMap<>();
			}
			this.persistent.put(key, value);
			return this;
		}

		/**
		 * API name: {@code transient}
		 */
		public Builder transient_(Map<String, JsonValue> value) {
			this.transient_ = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #transient_(Map)}, creating the map if needed.
		 */
		public Builder putTransient_(String key, JsonValue value) {
			if (this.transient_ == null) {
				this.transient_ = new HashMap<>();
			}
			this.transient_.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link PutSettingsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutSettingsResponse build() {

			return new PutSettingsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutSettingsResponse
	 */
	public static final JsonpDeserializer<PutSettingsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutSettingsResponse::setupPutSettingsResponseDeserializer);

	protected static void setupPutSettingsResponseDeserializer(DelegatingDeserializer<PutSettingsResponse.Builder> op) {

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::persistent, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"persistent");
		op.add(Builder::transient_, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"transient");

	}

}
