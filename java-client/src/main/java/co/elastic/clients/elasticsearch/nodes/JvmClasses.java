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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes._types.JvmClasses
public final class JvmClasses implements ToJsonp {
	private final Number currentLoadedCount;

	private final Number totalLoadedCount;

	private final Number totalUnloadedCount;

	// ---------------------------------------------------------------------------------------------

	protected JvmClasses(Builder builder) {

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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

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
	 * Json parser for JvmClasses
	 */
	public static final JsonpValueParser<JvmClasses> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, JvmClasses::setupJvmClassesParser);

	protected static void setupJvmClassesParser(DelegatingJsonpValueParser<JvmClasses.Builder> op) {

		op.add(Builder::currentLoadedCount, JsonpValueParser.numberParser(), "current_loaded_count");
		op.add(Builder::totalLoadedCount, JsonpValueParser.numberParser(), "total_loaded_count");
		op.add(Builder::totalUnloadedCount, JsonpValueParser.numberParser(), "total_unloaded_count");

	}

}
