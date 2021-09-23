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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.get_settings.Response
public final class GetSettingsResponse implements JsonpSerializable {
	private final Map<String, JsonData> persistent;

	private final Map<String, JsonData> transient_;

	@Nullable
	private final Map<String, JsonData> defaults;

	// ---------------------------------------------------------------------------------------------

	public GetSettingsResponse(Builder builder) {

		this.persistent = Objects.requireNonNull(builder.persistent, "persistent");
		this.transient_ = Objects.requireNonNull(builder.transient_, "transient");
		this.defaults = builder.defaults;

	}

	/**
	 * API name: {@code persistent}
	 */
	public Map<String, JsonData> persistent() {
		return this.persistent;
	}

	/**
	 * API name: {@code transient}
	 */
	public Map<String, JsonData> transient_() {
		return this.transient_;
	}

	/**
	 * API name: {@code defaults}
	 */
	@Nullable
	public Map<String, JsonData> defaults() {
		return this.defaults;
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

		generator.writeKey("persistent");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.persistent.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("transient");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.transient_.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.defaults != null) {

			generator.writeKey("defaults");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.defaults.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSettingsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetSettingsResponse> {
		private Map<String, JsonData> persistent;

		private Map<String, JsonData> transient_;

		@Nullable
		private Map<String, JsonData> defaults;

		/**
		 * API name: {@code persistent}
		 */
		public Builder persistent(Map<String, JsonData> value) {
			this.persistent = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #persistent(Map)}, creating the map if needed.
		 */
		public Builder putPersistent(String key, JsonData value) {
			if (this.persistent == null) {
				this.persistent = new HashMap<>();
			}
			this.persistent.put(key, value);
			return this;
		}

		/**
		 * API name: {@code transient}
		 */
		public Builder transient_(Map<String, JsonData> value) {
			this.transient_ = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #transient_(Map)}, creating the map if needed.
		 */
		public Builder putTransient(String key, JsonData value) {
			if (this.transient_ == null) {
				this.transient_ = new HashMap<>();
			}
			this.transient_.put(key, value);
			return this;
		}

		/**
		 * API name: {@code defaults}
		 */
		public Builder defaults(@Nullable Map<String, JsonData> value) {
			this.defaults = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #defaults(Map)}, creating the map if needed.
		 */
		public Builder putDefaults(String key, JsonData value) {
			if (this.defaults == null) {
				this.defaults = new HashMap<>();
			}
			this.defaults.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link GetSettingsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSettingsResponse build() {

			return new GetSettingsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetSettingsResponse}
	 */
	public static final JsonpDeserializer<GetSettingsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetSettingsResponse::setupGetSettingsResponseDeserializer);

	protected static void setupGetSettingsResponseDeserializer(DelegatingDeserializer<GetSettingsResponse.Builder> op) {

		op.add(Builder::persistent, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "persistent");
		op.add(Builder::transient_, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "transient");
		op.add(Builder::defaults, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "defaults");

	}

}
