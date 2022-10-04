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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.IpPrefixAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.IpPrefixAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class IpPrefixAggregation extends BucketAggregationBase implements AggregationVariant {
	private final String field;

	private final int prefixLength;

	@Nullable
	private final Boolean isIpv6;

	@Nullable
	private final Boolean appendPrefixLength;

	@Nullable
	private final Boolean keyed;

	@Nullable
	private final Long minDocCount;

	// ---------------------------------------------------------------------------------------------

	private IpPrefixAggregation(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.prefixLength = ApiTypeHelper.requireNonNull(builder.prefixLength, this, "prefixLength");
		this.isIpv6 = builder.isIpv6;
		this.appendPrefixLength = builder.appendPrefixLength;
		this.keyed = builder.keyed;
		this.minDocCount = builder.minDocCount;

	}

	public static IpPrefixAggregation of(Function<Builder, ObjectBuilder<IpPrefixAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.IpPrefix;
	}

	/**
	 * Required - The document IP address field to aggregation on. The field mapping
	 * type must be <code>ip</code>
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - Length of the network prefix. For IPv4 addresses the accepted
	 * range is [0, 32]. For IPv6 addresses the accepted range is [0, 128].
	 * <p>
	 * API name: {@code prefix_length}
	 */
	public final int prefixLength() {
		return this.prefixLength;
	}

	/**
	 * Defines whether the prefix applies to IPv6 addresses.
	 * <p>
	 * API name: {@code is_ipv6}
	 */
	@Nullable
	public final Boolean isIpv6() {
		return this.isIpv6;
	}

	/**
	 * Defines whether the prefix length is appended to IP address keys in the
	 * response.
	 * <p>
	 * API name: {@code append_prefix_length}
	 */
	@Nullable
	public final Boolean appendPrefixLength() {
		return this.appendPrefixLength;
	}

	/**
	 * Defines whether buckets are returned as a hash rather than an array in the
	 * response.
	 * <p>
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
	}

	/**
	 * Minimum number of documents for buckets to be included in the response.
	 * <p>
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public final Long minDocCount() {
		return this.minDocCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("prefix_length");
		generator.write(this.prefixLength);

		if (this.isIpv6 != null) {
			generator.writeKey("is_ipv6");
			generator.write(this.isIpv6);

		}
		if (this.appendPrefixLength != null) {
			generator.writeKey("append_prefix_length");
			generator.write(this.appendPrefixLength);

		}
		if (this.keyed != null) {
			generator.writeKey("keyed");
			generator.write(this.keyed);

		}
		if (this.minDocCount != null) {
			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IpPrefixAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IpPrefixAggregation> {
		private String field;

		private Integer prefixLength;

		@Nullable
		private Boolean isIpv6;

		@Nullable
		private Boolean appendPrefixLength;

		@Nullable
		private Boolean keyed;

		@Nullable
		private Long minDocCount;

		/**
		 * Required - The document IP address field to aggregation on. The field mapping
		 * type must be <code>ip</code>
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - Length of the network prefix. For IPv4 addresses the accepted
		 * range is [0, 32]. For IPv6 addresses the accepted range is [0, 128].
		 * <p>
		 * API name: {@code prefix_length}
		 */
		public final Builder prefixLength(int value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * Defines whether the prefix applies to IPv6 addresses.
		 * <p>
		 * API name: {@code is_ipv6}
		 */
		public final Builder isIpv6(@Nullable Boolean value) {
			this.isIpv6 = value;
			return this;
		}

		/**
		 * Defines whether the prefix length is appended to IP address keys in the
		 * response.
		 * <p>
		 * API name: {@code append_prefix_length}
		 */
		public final Builder appendPrefixLength(@Nullable Boolean value) {
			this.appendPrefixLength = value;
			return this;
		}

		/**
		 * Defines whether buckets are returned as a hash rather than an array in the
		 * response.
		 * <p>
		 * API name: {@code keyed}
		 */
		public final Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		/**
		 * Minimum number of documents for buckets to be included in the response.
		 * <p>
		 * API name: {@code min_doc_count}
		 */
		public final Builder minDocCount(@Nullable Long value) {
			this.minDocCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IpPrefixAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpPrefixAggregation build() {
			_checkSingleUse();

			return new IpPrefixAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IpPrefixAggregation}
	 */
	public static final JsonpDeserializer<IpPrefixAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IpPrefixAggregation::setupIpPrefixAggregationDeserializer);

	protected static void setupIpPrefixAggregationDeserializer(ObjectDeserializer<IpPrefixAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::prefixLength, JsonpDeserializer.integerDeserializer(), "prefix_length");
		op.add(Builder::isIpv6, JsonpDeserializer.booleanDeserializer(), "is_ipv6");
		op.add(Builder::appendPrefixLength, JsonpDeserializer.booleanDeserializer(), "append_prefix_length");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");
		op.add(Builder::minDocCount, JsonpDeserializer.longDeserializer(), "min_doc_count");

	}

}
