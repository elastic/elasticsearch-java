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

package co.elastic.clients.elasticsearch.indices.reload_search_analyzers;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.reload_search_analyzers.ReloadResult

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.reload_search_analyzers.ReloadResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReloadResult implements JsonpSerializable {
	private final List<ReloadDetails> reloadDetails;

	private final ShardStatistics shards;

	// ---------------------------------------------------------------------------------------------

	protected ReloadResult(AbstractBuilder<?> builder) {

		this.reloadDetails = ApiTypeHelper.unmodifiableRequired(builder.reloadDetails, this, "reloadDetails");
		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");

	}

	public static ReloadResult reloadResultOf(Function<Builder, ObjectBuilder<ReloadResult>> fn) {
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

		if (ApiTypeHelper.isDefined(this.reloadDetails)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReloadResult}.
	 */

	public static class Builder extends ReloadResult.AbstractBuilder<Builder> implements ObjectBuilder<ReloadResult> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReloadResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReloadResult build() {
			_checkSingleUse();

			return new ReloadResult(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private List<ReloadDetails> reloadDetails;

		private ShardStatistics shards;

		/**
		 * Required - API name: {@code reload_details}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>reloadDetails</code>.
		 */
		public final BuilderT reloadDetails(List<ReloadDetails> list) {
			this.reloadDetails = _listAddAll(this.reloadDetails, list);
			return self();
		}

		/**
		 * Required - API name: {@code reload_details}
		 * <p>
		 * Adds one or more values to <code>reloadDetails</code>.
		 */
		public final BuilderT reloadDetails(ReloadDetails value, ReloadDetails... values) {
			this.reloadDetails = _listAdd(this.reloadDetails, value, values);
			return self();
		}

		/**
		 * Required - API name: {@code reload_details}
		 * <p>
		 * Adds a value to <code>reloadDetails</code> using a builder lambda.
		 */
		public final BuilderT reloadDetails(Function<ReloadDetails.Builder, ObjectBuilder<ReloadDetails>> fn) {
			return reloadDetails(fn.apply(new ReloadDetails.Builder()).build());
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final BuilderT shards(ShardStatistics value) {
			this.shards = value;
			return self();
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final BuilderT shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReloadResult}
	 */
	public static final JsonpDeserializer<ReloadResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReloadResult::setupReloadResultDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupReloadResultDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::reloadDetails, JsonpDeserializer.arrayDeserializer(ReloadDetails._DESERIALIZER),
				"reload_details");
		op.add(AbstractBuilder::shards, ShardStatistics._DESERIALIZER, "_shards");

	}

}
