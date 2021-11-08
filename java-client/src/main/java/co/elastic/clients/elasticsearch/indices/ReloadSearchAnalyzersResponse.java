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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.reload_search_analyzers.Response
@JsonpDeserializable
public class ReloadSearchAnalyzersResponse implements JsonpSerializable {
	private final List<ReloadDetails> reloadDetails;

	private final ShardStatistics shards;

	// ---------------------------------------------------------------------------------------------

	private ReloadSearchAnalyzersResponse(Builder builder) {

		this.reloadDetails = ModelTypeHelper.unmodifiableRequired(builder.reloadDetails, this, "reloadDetails");
		this.shards = ModelTypeHelper.requireNonNull(builder.shards, this, "shards");

	}

	public static ReloadSearchAnalyzersResponse of(Function<Builder, ObjectBuilder<ReloadSearchAnalyzersResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code reload_details}
	 */
	public final List<ReloadDetails> reloadDetails() {
		return this.reloadDetails;
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
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

		if (ModelTypeHelper.isDefined(this.reloadDetails)) {
			generator.writeKey("reload_details");
			generator.writeStartArray();
			for (ReloadDetails item0 : this.reloadDetails) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReloadSearchAnalyzersResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ReloadSearchAnalyzersResponse> {
		private List<ReloadDetails> reloadDetails;

		private ShardStatistics shards;

		/**
		 * Required - API name: {@code reload_details}
		 */
		public final Builder reloadDetails(List<ReloadDetails> value) {
			this.reloadDetails = value;
			return this;
		}

		/**
		 * Required - API name: {@code reload_details}
		 */
		public final Builder reloadDetails(ReloadDetails... value) {
			this.reloadDetails = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code reload_details}
		 */
		@SafeVarargs
		public final Builder reloadDetails(Function<ReloadDetails.Builder, ObjectBuilder<ReloadDetails>>... fns) {
			this.reloadDetails = new ArrayList<>(fns.length);
			for (Function<ReloadDetails.Builder, ObjectBuilder<ReloadDetails>> fn : fns) {
				this.reloadDetails.add(fn.apply(new ReloadDetails.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Builds a {@link ReloadSearchAnalyzersResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReloadSearchAnalyzersResponse build() {
			_checkSingleUse();

			return new ReloadSearchAnalyzersResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReloadSearchAnalyzersResponse}
	 */
	public static final JsonpDeserializer<ReloadSearchAnalyzersResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, ReloadSearchAnalyzersResponse::setupReloadSearchAnalyzersResponseDeserializer,
			Builder::build);

	protected static void setupReloadSearchAnalyzersResponseDeserializer(
			DelegatingDeserializer<ReloadSearchAnalyzersResponse.Builder> op) {

		op.add(Builder::reloadDetails, JsonpDeserializer.arrayDeserializer(ReloadDetails._DESERIALIZER),
				"reload_details");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");

	}

}
