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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices._types.IndexRoutingAllocationDisk
public final class IndexRoutingAllocationDisk implements ToJsonp {
	private final JsonValue thresholdEnabled;

	// ---------------------------------------------------------------------------------------------

	protected IndexRoutingAllocationDisk(Builder builder) {

		this.thresholdEnabled = Objects.requireNonNull(builder.thresholdEnabled, "threshold_enabled");

	}

	/**
	 * API name: {@code threshold_enabled}
	 */
	public JsonValue thresholdEnabled() {
		return this.thresholdEnabled;
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

		generator.writeKey("threshold_enabled");
		generator.write(this.thresholdEnabled);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRoutingAllocationDisk}.
	 */
	public static class Builder implements ObjectBuilder<IndexRoutingAllocationDisk> {
		private JsonValue thresholdEnabled;

		/**
		 * API name: {@code threshold_enabled}
		 */
		public Builder thresholdEnabled(JsonValue value) {
			this.thresholdEnabled = value;
			return this;
		}

		/**
		 * Builds a {@link IndexRoutingAllocationDisk}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRoutingAllocationDisk build() {

			return new IndexRoutingAllocationDisk(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for IndexRoutingAllocationDisk
	 */
	public static final JsonpValueParser<IndexRoutingAllocationDisk> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, IndexRoutingAllocationDisk::setupIndexRoutingAllocationDiskParser);

	protected static void setupIndexRoutingAllocationDiskParser(
			DelegatingJsonpValueParser<IndexRoutingAllocationDisk.Builder> op) {

		op.add(Builder::thresholdEnabled, JsonpValueParser.jsonValueParser(), "threshold_enabled");

	}

}
