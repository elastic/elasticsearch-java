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

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.indices.reload_search_analyzers.ReloadDetails;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.reload_search_analyzers.Response
public final class ReloadSearchAnalyzersResponse implements ToJsonp {
	private final List<ReloadDetails> reloadDetails;

	private final ShardStatistics shards;

	// ---------------------------------------------------------------------------------------------

	protected ReloadSearchAnalyzersResponse(Builder builder) {

		this.reloadDetails = Objects.requireNonNull(builder.reloadDetails, "reload_details");
		this.shards = Objects.requireNonNull(builder.shards, "_shards");

	}

	/**
	 * API name: {@code reload_details}
	 */
	public List<ReloadDetails> reloadDetails() {
		return this.reloadDetails;
	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics shards() {
		return this.shards;
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

		generator.writeKey("reload_details");
		generator.writeStartArray();
		for (ReloadDetails item0 : this.reloadDetails) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("_shards");
		this.shards.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReloadSearchAnalyzersResponse}.
	 */
	public static class Builder implements ObjectBuilder<ReloadSearchAnalyzersResponse> {
		private List<ReloadDetails> reloadDetails;

		private ShardStatistics shards;

		/**
		 * API name: {@code reload_details}
		 */
		public Builder reloadDetails(List<ReloadDetails> value) {
			this.reloadDetails = value;
			return this;
		}

		/**
		 * API name: {@code reload_details}
		 */
		public Builder reloadDetails(ReloadDetails... value) {
			this.reloadDetails = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #reloadDetails(List)}, creating the list if needed.
		 */
		public Builder addReloadDetails(ReloadDetails value) {
			if (this.reloadDetails == null) {
				this.reloadDetails = new ArrayList<>();
			}
			this.reloadDetails.add(value);
			return this;
		}

		/**
		 * Set {@link #reloadDetails(List)} to a singleton list.
		 */
		public Builder reloadDetails(Function<ReloadDetails.Builder, ObjectBuilder<ReloadDetails>> fn) {
			return this.reloadDetails(fn.apply(new ReloadDetails.Builder()).build());
		}

		/**
		 * Add a value to {@link #reloadDetails(List)}, creating the list if needed.
		 */
		public Builder addReloadDetails(Function<ReloadDetails.Builder, ObjectBuilder<ReloadDetails>> fn) {
			return this.addReloadDetails(fn.apply(new ReloadDetails.Builder()).build());
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Builds a {@link ReloadSearchAnalyzersResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReloadSearchAnalyzersResponse build() {

			return new ReloadSearchAnalyzersResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ReloadSearchAnalyzersResponse
	 */
	public static final JsonpDeserializer<ReloadSearchAnalyzersResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					ReloadSearchAnalyzersResponse::setupReloadSearchAnalyzersResponseDeserializer);

	protected static void setupReloadSearchAnalyzersResponseDeserializer(
			DelegatingDeserializer<ReloadSearchAnalyzersResponse.Builder> op) {

		op.add(Builder::reloadDetails, JsonpDeserializer.arrayDeserializer(ReloadDetails.DESERIALIZER),
				"reload_details");
		op.add(Builder::shards, ShardStatistics.DESERIALIZER, "_shards");

	}

}
