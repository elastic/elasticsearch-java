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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes._types.JvmClasses
public final class JvmClasses implements JsonpSerializable {
	private final Number currentLoadedCount;

	private final Number totalLoadedCount;

	private final Number totalUnloadedCount;

	// ---------------------------------------------------------------------------------------------

	public JvmClasses(Builder builder) {

		this.currentLoadedCount = Objects.requireNonNull(builder.currentLoadedCount, "current_loaded_count");
		this.totalLoadedCount = Objects.requireNonNull(builder.totalLoadedCount, "total_loaded_count");
		this.totalUnloadedCount = Objects.requireNonNull(builder.totalUnloadedCount, "total_unloaded_count");

	}

	/**
	 * API name: {@code current_loaded_count}
	 */
	public Number currentLoadedCount() {
		return this.currentLoadedCount;
	}

	/**
	 * API name: {@code total_loaded_count}
	 */
	public Number totalLoadedCount() {
		return this.totalLoadedCount;
	}

	/**
	 * API name: {@code total_unloaded_count}
	 */
	public Number totalUnloadedCount() {
		return this.totalUnloadedCount;
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

		generator.writeKey("current_loaded_count");
		generator.write(this.currentLoadedCount.doubleValue());

		generator.writeKey("total_loaded_count");
		generator.write(this.totalLoadedCount.doubleValue());

		generator.writeKey("total_unloaded_count");
		generator.write(this.totalUnloadedCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JvmClasses}.
	 */
	public static class Builder implements ObjectBuilder<JvmClasses> {
		private Number currentLoadedCount;

		private Number totalLoadedCount;

		private Number totalUnloadedCount;

		/**
		 * API name: {@code current_loaded_count}
		 */
		public Builder currentLoadedCount(Number value) {
			this.currentLoadedCount = value;
			return this;
		}

		/**
		 * API name: {@code total_loaded_count}
		 */
		public Builder totalLoadedCount(Number value) {
			this.totalLoadedCount = value;
			return this;
		}

		/**
		 * API name: {@code total_unloaded_count}
		 */
		public Builder totalUnloadedCount(Number value) {
			this.totalUnloadedCount = value;
			return this;
		}

		/**
		 * Builds a {@link JvmClasses}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JvmClasses build() {

			return new JvmClasses(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JvmClasses}
	 */
	public static final JsonpDeserializer<JvmClasses> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, JvmClasses::setupJvmClassesDeserializer);

	protected static void setupJvmClassesDeserializer(DelegatingDeserializer<JvmClasses.Builder> op) {

		op.add(Builder::currentLoadedCount, JsonpDeserializer.numberDeserializer(), "current_loaded_count");
		op.add(Builder::totalLoadedCount, JsonpDeserializer.numberDeserializer(), "total_loaded_count");
		op.add(Builder::totalUnloadedCount, JsonpDeserializer.numberDeserializer(), "total_unloaded_count");

	}

}
