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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.Audit
@JsonpDeserializable
public final class Audit extends FeatureToggle {
	@Nullable
	private final List<String> outputs;

	// ---------------------------------------------------------------------------------------------

	public Audit(Builder builder) {
		super(builder);

		this.outputs = builder.outputs;

	}

	/**
	 * API name: {@code outputs}
	 */
	@Nullable
	public List<String> outputs() {
		return this.outputs;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.outputs != null) {

			generator.writeKey("outputs");
			generator.writeStartArray();
			for (String item0 : this.outputs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Audit}.
	 */
	public static class Builder extends FeatureToggle.AbstractBuilder<Builder> implements ObjectBuilder<Audit> {
		@Nullable
		private List<String> outputs;

		/**
		 * API name: {@code outputs}
		 */
		public Builder outputs(@Nullable List<String> value) {
			this.outputs = value;
			return this;
		}

		/**
		 * API name: {@code outputs}
		 */
		public Builder outputs(String... value) {
			this.outputs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #outputs(List)}, creating the list if needed.
		 */
		public Builder addOutputs(String value) {
			if (this.outputs == null) {
				this.outputs = new ArrayList<>();
			}
			this.outputs.add(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Audit}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Audit build() {

			return new Audit(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Audit}
	 */
	public static final JsonpDeserializer<Audit> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Audit::setupAuditDeserializer, Builder::build);

	protected static void setupAuditDeserializer(DelegatingDeserializer<Audit.Builder> op) {
		FeatureToggle.setupFeatureToggleDeserializer(op);
		op.add(Builder::outputs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"outputs");

	}

}
