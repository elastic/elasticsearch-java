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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: indices._types.IndexRoutingAllocationInitialRecovery
public final class IndexRoutingAllocationInitialRecovery implements ToJsonp {
	@Nullable
	private final String _id;

	// ---------------------------------------------------------------------------------------------

	protected IndexRoutingAllocationInitialRecovery(Builder builder) {

		this._id = builder._id;

	}

	/**
	 * API name: {@code _id}
	 */
	@Nullable
	public String _id() {
		return this._id;
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

		if (this._id != null) {

			generator.writeKey("_id");
			generator.write(this._id);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRoutingAllocationInitialRecovery}.
	 */
	public static class Builder implements ObjectBuilder<IndexRoutingAllocationInitialRecovery> {
		@Nullable
		private String _id;

		/**
		 * API name: {@code _id}
		 */
		public Builder _id(@Nullable String value) {
			this._id = value;
			return this;
		}

		/**
		 * Builds a {@link IndexRoutingAllocationInitialRecovery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRoutingAllocationInitialRecovery build() {

			return new IndexRoutingAllocationInitialRecovery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for IndexRoutingAllocationInitialRecovery
	 */
	public static final JsonpValueParser<IndexRoutingAllocationInitialRecovery> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new,
					IndexRoutingAllocationInitialRecovery::setupIndexRoutingAllocationInitialRecoveryParser);

	protected static void setupIndexRoutingAllocationInitialRecoveryParser(
			DelegatingJsonpValueParser<IndexRoutingAllocationInitialRecovery.Builder> op) {

		op.add(Builder::_id, JsonpValueParser.stringParser(), "_id");

	}

}
