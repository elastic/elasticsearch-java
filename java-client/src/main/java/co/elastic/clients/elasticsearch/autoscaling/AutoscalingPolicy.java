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

package co.elastic.clients.elasticsearch.autoscaling;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: autoscaling._types.AutoscalingPolicy
@JsonpDeserializable
public final class AutoscalingPolicy implements JsonpSerializable {
	private final List<String> roles;

	private final Map<String, JsonData> deciders;

	// ---------------------------------------------------------------------------------------------

	public AutoscalingPolicy(Builder builder) {

		this.roles = Objects.requireNonNull(builder.roles, "roles");
		this.deciders = Objects.requireNonNull(builder.deciders, "deciders");

	}

	/**
	 * API name: {@code roles}
	 */
	public List<String> roles() {
		return this.roles;
	}

	/**
	 * Decider settings
	 * <p>
	 * API name: {@code deciders}
	 */
	public Map<String, JsonData> deciders() {
		return this.deciders;
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

		generator.writeKey("roles");
		generator.writeStartArray();
		for (String item0 : this.roles) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("deciders");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.deciders.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoscalingPolicy}.
	 */
	public static class Builder implements ObjectBuilder<AutoscalingPolicy> {
		private List<String> roles;

		private Map<String, JsonData> deciders;

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(List<String> value) {
			this.roles = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(String... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #roles(List)}, creating the list if needed.
		 */
		public Builder addRoles(String value) {
			if (this.roles == null) {
				this.roles = new ArrayList<>();
			}
			this.roles.add(value);
			return this;
		}

		/**
		 * Decider settings
		 * <p>
		 * API name: {@code deciders}
		 */
		public Builder deciders(Map<String, JsonData> value) {
			this.deciders = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #deciders(Map)}, creating the map if needed.
		 */
		public Builder putDeciders(String key, JsonData value) {
			if (this.deciders == null) {
				this.deciders = new HashMap<>();
			}
			this.deciders.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link AutoscalingPolicy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoscalingPolicy build() {

			return new AutoscalingPolicy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoscalingPolicy}
	 */
	public static final JsonpDeserializer<AutoscalingPolicy> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoscalingPolicy::setupAutoscalingPolicyDeserializer, Builder::build);

	protected static void setupAutoscalingPolicyDeserializer(DelegatingDeserializer<AutoscalingPolicy.Builder> op) {

		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::deciders, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "deciders");

	}

}
